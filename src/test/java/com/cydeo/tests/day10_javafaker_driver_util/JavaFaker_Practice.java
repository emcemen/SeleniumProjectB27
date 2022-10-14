package com.cydeo.tests.day10_javafaker_driver_util;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {

    @Test
    public void java_faker_test(){

        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().city() = " + faker.address().city());

        System.out.println("faker.gameOfThrones().dragon() = " + faker.gameOfThrones().dragon());

        System.out.println("faker.numerify() = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify() = " + faker.numerify("456-###-###"));

        System.out.println("faker.numerify(\"######\") = " + faker.numerify("######"));
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));
        System.out.println("faker.bothify(\"##???#??\") = " + faker.bothify("##???#??"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        //I want to change the way of printing output (6007-2267-7631-5435)----> from that to this (6007226776315435)
       // faker.finance().creditCard().replaceAll("-","").soutv
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.backToTheFuture().character() = " + faker.backToTheFuture().character());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"chuckNorris\",\"Emre\") = " + faker.chuckNorris().fact().replaceAll("chuckNorris", "Emre"));

    }









}
