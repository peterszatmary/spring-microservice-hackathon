package com.szatmary.peter;

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
     * read words from text file (in resources) and count groups of them. Just like example.
     * @return
     */
    public long get() {
        JavaPairRDD<String, Integer> words = sparkContext.
                textFile("parser-microservice/src/main/resources/wordGroupCount_input.txt").
                flatMap(l -> Arrays.asList(l.split(" ")).iterator()).
                mapToPair(w -> new Tuple2<>(w, 1)).
                reduceByKey((a, b) -> a + b).sortByKey();
        long result = words.count();
        System.out.println("Words groups = " + result);
        return result;
    }
}