import java.util.ArrayList;
import java.util.List;

public class Skills{
   private static List <String> skillList= new ArrayList<String>();

    public static void addSkill(String skill) {
        int i=0;
        i=i+1
        skill = (Integer.toString(i) + " " + skill);

        skillList.add(skill);

    }

    public static void displaySkills() {

        for (int i = 0; i < skillList.size(); i++) {
            System.out.println(skillList.get(i));
        }

    }

    public static void deleteSkill(int code) {
        for (int i = 0; i < skillList.size(); i++) {
            if (i < 0) {
                skillList.remove(i);
            }
        }
        System.out.println(skillList);
    }


}
