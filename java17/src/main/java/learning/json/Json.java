package learning.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;

final class Json {
    private static final Logger logger = LoggerFactory.getLogger(Json.class);

    public static void main(String[] args) throws IOException {
        //Makes it easier to read the json file
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Staff staff = createStaffObject();

        // Java objects to String
        // String json = gson.toJson(staff);

        // Java objects to File
        try (FileWriter writer = new FileWriter("java17/src/main/java/learning/json/staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static @NotNull Staff createStaffObject() {

        var staff = new Staff();

        staff.setName("Yusuf");
        staff.setAge(35);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
        Map<String, BigDecimal> salary = Map.of("2010", new BigDecimal(10000),
                "2012", new BigDecimal(12000),
                "2018", new BigDecimal(14000));
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

        return staff;
    }
}

