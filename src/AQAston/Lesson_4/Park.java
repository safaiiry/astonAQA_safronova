package AQAston.Lesson_4;

public class Park {
    class AboutAttractions {
        private static String AttractionName;
        private static int WorkingTime;
        private static int Cost;

        // геттеры и сеттеры

        public static int getCost() {
            return Cost;
        }

        public static int getWorkingTime() {
            return WorkingTime;
        }

        public static String getAttractionName() {
            return AttractionName;
        }

        public static void setWorkingTime(int workingTime) {
            WorkingTime = workingTime;
        }

        public static void setAttractionName(String attractionName) {
            AttractionName = attractionName;
        }

        public static void setCost(int cost) {
            Cost = cost;
        }
    }
}
