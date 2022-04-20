package com.minchul.javalab.object.ch14;

import com.minchul.javalab.object.ch14.strategy.Car;
import com.minchul.javalab.object.ch14.strategy.FlyableEngine;
import com.minchul.javalab.object.ch14.strategy.ForwardEngine;
import com.minchul.javalab.object.ch14.strategy.TemplateCallbackCar;
import com.minchul.javalab.object.ch14.templatemethod.ExpendTemplate1;
import com.minchul.javalab.object.ch14.templatemethod.ExpendTemplate2;

public class Application {

    public static void main(String[] args) {
        ExpendTemplate1 expendTemplate1 = new ExpendTemplate1();
        ExpendTemplate2 expendTemplate2 = new ExpendTemplate2();

        expendTemplate1.execute();
        expendTemplate2.execute();

        Car flyableCar = new Car(new FlyableEngine());
        Car forwardCar = new Car(new ForwardEngine());

        flyableCar.drive();
        forwardCar.drive();

        TemplateCallbackCar callbackCar = new TemplateCallbackCar();
        callbackCar.drive(new FlyableEngine());
        callbackCar.drive(new ForwardEngine());
    }

}
