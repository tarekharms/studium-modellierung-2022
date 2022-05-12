package vorlesung_04_22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Auto> autoList = new ArrayList<>();
        List<Boot> bootList = new ArrayList<>();

        Auto kombi = new Kombi();
        Auto cabrio = new Cabrio();

        Boot segelboot = new Segelboot();
        Boot motorboot = new Motorboot();

        Amphibienfahrzeug amphibienfahrzeug = new Amphibienfahrzeug();

        autoList.add(kombi);
        autoList.add(cabrio);
        autoList.add(amphibienfahrzeug);

        bootList.add(motorboot);
        bootList.add(segelboot);
        bootList.add(amphibienfahrzeug);

        for(Boot boot : bootList)
        {
            boot.schwimmen();
        }

        for(Auto auto : autoList)
        {
            auto.fahren();
        }
    }
}
