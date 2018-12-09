package com.duck2play.duck2play;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Duck2playApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test1(){
		int a = 123;
	}

	@Test
	public void test2(){
		int a = 1;
		int b = a + 5;
		Assert.assertEquals(2,b);
	}

	@Test
	public void testSeven(){
		String seven = "seven";
		if (seven.length()==5){
			System.out.println("Seven");
		}else {
			System.out.println("So Sad");
		}
	}


}
