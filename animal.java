public class animal {
    public void animalfriend(){
        System.out.println("The animal is cute");
    }
}

class cat extends animal {
    public void animalfriend(){
        System.out.println("janetempe");
    }
}

class dog extends animal {
    public void animalfriend(){
        System.out.println ("kieratempe");
    }
}

class main {
    public static void main (String[] args) {
        animal myanimal = new animal (); //create a animal object
        animal mycat = new cat (); //create a cat object
        animal mydog = new dog (); //create a dog object
        myanimal.animalfriend();
        mycat.animalfriend();
        mydog.animalfriend();

    }
}