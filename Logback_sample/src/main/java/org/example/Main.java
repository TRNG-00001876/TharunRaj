package org.example;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        log.info("This is Just information");
        log.error("This is error");
        log.warn("This is Warning");




    }

}