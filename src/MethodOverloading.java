public class MethodOverloading {

    void updateProfile(int id){

    }
    //Method overloading with different method argument type.
    void updateProfile(char id){

    }
    //Cannot do method overloading with different return type
    /*boolean updateProfile(int id){
        return true;
    }*/
    //Method overloading with different number of arguments.
    void updateProfile(int id,boolean x){

    }
}
