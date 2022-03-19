package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PretestApplicationTests {

    @Test
    void isPasswordEquals() {
        String a = "clave";
        String b = "clave";
        UserUtils userUtils = new UserUtils();
        assertTrue(userUtils.isPasswordEqual(a,b));
    }

}
