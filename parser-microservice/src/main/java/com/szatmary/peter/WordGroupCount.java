package com.szatmary.peter;

import com.szatmary.peter.obj.WordCountObj;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scala.Tuple2;

import java.util.Arrays;

/**
 * Created by peterszatmary on 07/05/2017.
 */
@Component
public class WordGroupCount {

    @Autowired
    private JavaSparkContext sparkContext;

    /**
     * read words from text file (in resources) and count groups of them.
     * Just like example. Reads raw test.
     *
     *
     *
     * @return
     */
    public WordCountObj get(String input) {

        if (null == input || "".equals(input)) {
            return new WordCountObj();
        }

        JavaPairRDD<String, Integer> wordGroups = sparkContext.
                parallelize(Arrays.asList(input.split(" "))).
                mapToPair(w -> new Tuple2<>(w, 1)).
                reduceByKey((a, b) -> a + b).sortByKey();

        //TODO not ok calling same twice. With big data is it really performance problem
        long allCount = sparkContext.parallelize(Arrays.asList(input.split(" "))).count();

        WordCountObj result = new WordCountObj();
        result.setAllWordCount(allCount);
        result.setSizeOfInput(input.length());
        result.setWordGroupCount(wordGroups.count());

        System.out.println("Words groups = " + result);

        return result;
    }
}