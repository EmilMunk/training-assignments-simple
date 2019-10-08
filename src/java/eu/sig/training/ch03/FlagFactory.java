package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        HashMap<String, List<Color>> nationalityColors = new HashMap<String, List<Color>>();
        nationalityColors.put("DUTCH", Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        nationalityColors.put("GERMAN", Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        nationalityColors.put("BELGIAN", Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        nationalityColors.put("FRENCH", Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        nationalityColors.put("ITALIAN", Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        nationalityColors.put("ROMANIA", Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        nationalityColors.put("HUNGARIAN", Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        nationalityColors.put("BULGARIAN", Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        nationalityColors.put("RUSSIA", Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        nationalityColors.put("UNCLASSIFIED", Arrays.asList(Color.GRAY));

        return nationalityColors.get(nationality.toString());
    }
    // end::getFlag[]

}