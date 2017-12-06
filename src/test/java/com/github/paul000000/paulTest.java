package com.github.paul000000;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class paulTest {
    @Test
    public void getType() throws Exception {
        paul triangle = new paul(5, 10, 5);
        String result = triangle.getType();
        Assert.assertEquals("不是三角形", result);
    }

}
