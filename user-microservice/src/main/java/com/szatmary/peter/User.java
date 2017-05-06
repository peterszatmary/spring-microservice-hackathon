package com.szatmary.peter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by peterszatmary on 06/05/2017.
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String role;
}
