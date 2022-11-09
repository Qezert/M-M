public class Test1 {
    public static void test1() {
        Conference conference = new Conference("Test Conf 1");
        conference.register(3);
        conference.showUp();
        conference.statistics();
    }
    
    public static void test2() {
        Conference conference = new Conference("Test Conf 2");
        conference.statistics();
    }
    
    public static void test2a() {
        Conference conference = new Conference("Test Conf 2");
        conference.register(-2);
        conference.showUp();
        conference.statistics();
    }  
    
    public static void test2b() {
        try { 
            test2a();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void test3a() throws CapacityExceededException {
        Conference conference = new Conference("Test Conf 3");
        conference.register(1);
        conference.showUp();
        conference.turnUp();
        conference.statistics();
    } 
    
    public static void test3b() {
        try {
        Conference conference = new Conference("Test Conf 3");
        conference.register(1);
        conference.showUp();
        conference.turnUp();
        conference.statistics();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}