package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Demo {


    //4 yra lyginis skaicius
   // dabar nera  19 valanda

    @Test
    public void testIfNumber4IsEven (){
        //duomenys
        int actualImput = 4;
        int expectedResults = 0;
        int actualResuls;

        //testo veiksmas
        actualResuls =actualImput % 2;

        //palyginimas
        Assert.assertEquals(actualResuls,expectedResults);


    }

    @Test
    public void testIfNumber5IsNotIsEven (){
        //duomenys
        int actualImput = 5;
        int expectedResults = 1;
        int actualResuls;

        //testo veiksmas
        actualResuls =actualImput % 2;

        //palyginimas
        Assert.assertTrue(actualResuls==expectedResults,
                "Actual: "+ actualResuls
                        + " Expected" + expectedResults);
    }
    @Test
    public void testIfTimeNowIsNot19Hour(){

        //duomenys
        int notExpectedTime = 19;
        int actualTime;
        boolean isSameTime;

        //test veiksmas
        actualTime = LocalTime.now().getHour();
       isSameTime= notExpectedTime == actualTime; // false


        //palyginimas
        Assert.assertFalse(isSameTime);

    }


}
