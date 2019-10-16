package com.cherrow.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    private StringUtils strings;

    @Before
    public void setUp() throws Exception {
        strings  = new StringUtils("");
    }

    @Test
    public void should_return_true_when_param_is_null() {
        //given

        //when

        //then
        assertTrue(strings.isBlank(null));
    }

    @Test
    public void should_return_true_when_param_is_empty() {
        //given

        //when

        //then
        assertTrue(strings.isBlank(""));
    }

    @Test
    public void should_return_true_when_param_is_white_space() {
        //given

        //when

        //then
        assertTrue(strings.isBlank(" "));
    }

    @Test
    public void should_return_false_when_param_has_content() {
        //given

        //when

        //then
        assertFalse(strings.isBlank("blob"));
    }

    @Test
    public void should_return_false_when_param_has_content_with_space() {
        //given

        //when

        //then
        assertFalse(strings.isBlank(" blob "));
    }

    @Test
    public void should_return_ture_when_param_is_null() {
        //given

        //when

        //then
        assertTrue(strings.isEmpty(null));
    }

    @Test
    public void should_return_ture_when_param_length_is_zero() {
        //given

        //when

        //then
        assertTrue(strings.isEmpty(""));
    }

    @Test
    public void should_return_false_when_param_length_greater_than_zero() {
        //given

        //when

        //then
        assertFalse(strings.isEmpty("4564"));
    }


    @Test
    public void should_return_ture_when_param_is_letter() {
        //given

        //when

        //then
        assertTrue(strings.isAlpha("ass"));
    }

    @Test
    public void should_return_false_when_param_contain_number() {
        //given

        //when

        //then
        assertFalse(strings.isAlpha("ass4564"));
    }

    @Test
    public void should_return_false_when_param_is_empty() {
        //given

        //when

        //then
        assertFalse(strings.isAlpha(""));
    }
}
