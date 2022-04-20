package com.minchul.javalab.object.ch14;

import com.minchul.javalab.object.ch14.templatemethod.ExpendTemplate1;
import com.minchul.javalab.object.ch14.templatemethod.ExpendTemplate2;

public class Application {

    public static void main(String[] args) {
        ExpendTemplate1 expendTemplate1 = new ExpendTemplate1();
        ExpendTemplate2 expendTemplate2 = new ExpendTemplate2();

        expendTemplate1.execute();
        expendTemplate2.execute();
    }

}