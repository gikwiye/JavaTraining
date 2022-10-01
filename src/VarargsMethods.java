public class VarargsMethods {

    void updateProfile(int id, int...age){
        System.out.println(id);
        System.out.println(age[1]);
    }

    public static void main(String[] args){
        VarargsMethods vm = new VarargsMethods();
        vm.updateProfile(3,1,2,3);

    }
}
