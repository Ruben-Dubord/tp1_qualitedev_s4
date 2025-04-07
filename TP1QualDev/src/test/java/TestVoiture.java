import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestVoiture {

@Test
    void testMarqueVoiture(){
    //Arrange
    Voiture v = new Voiture();

    //Act
    String bmw = "BMW";

    //Assert
    Assertions.assertEquals(v.getMarque(), bmw, "La marque doit être " + v.getMarque());
}

@Test
    void testPrixVoiture(){
        //Arrange
        Voiture v = new Voiture();

        //Act
        double prix = 0;

        //Assert
        Assertions.assertEquals(v.getPrix(), prix, "La prix doit être " + v.getPrix());
    }
    @Test
        void testImmatriculationVoiture(){
        //Arrange
        Voiture v = new Voiture();

        //Act
        String immatriculation = "AA-AAA-AA";

        //Assert
        Assertions.assertEquals(v.getImmatriculation(), immatriculation, "L'immatriculation doit être " + v.getImmatriculation());
    }

    @Test
        void testFormatImmatricualtionVoiture(){

        //Arrange
        Voiture v = new Voiture();

        //Act
        CharSequence immatriculation = "AA-AAA-AA";
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{2}-[A-Za-z0-9]{3}-[A-Za-z0-9]{2}");
        Matcher matcher = pattern.matcher(immatriculation);
        boolean matchFound = matcher.find();

        //Assert
        Assertions.assertTrue(matchFound, "L'immatriculation doit être " + v.getImmatriculation());
    }
}
