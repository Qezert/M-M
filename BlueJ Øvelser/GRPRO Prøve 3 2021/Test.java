public class Test {
    
    static void test() {
        Election election = new Election("Are fries better with remoulade than ketchup?");
        
        election.vote('y');
        election.vote('y');
        election.vote('n');
        
        election.display();
    }
    
    static void test21() {
        Election election = new Election(null);
        
        election.vote('y');
        election.vote('y');
        election.vote('n');
        
        election.display();
    }
    
    static void test22() {
        try {
            test21();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void test3() {
        Election election = new Election("Is McDonalds better than Burger King?");
        
        election.display();
    }
    
    static void test41() {
        Election election = new Election("Are fries better with remoulade than ketchup?");
        
        election.vote('x');
        election.vote('n');
        
        election.display();
    }
    
    static void test42() {
        try { test41();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}