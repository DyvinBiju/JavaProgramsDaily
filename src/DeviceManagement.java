class Device{
    final void powerOn(){
        System.out.println("Power is ON");
    }
}

class Phone extends Device{
    void call(String number){
        System.out.println("Number: "+number);
    }

    void installApp(String name){
        System.out.println("Name: "+name);
    }
}

class SmartPhone extends Phone{
    @Override
    void installApp(String name){
        System.out.println("Name: "+name);
    }
}

public class DeviceManagement{
    public  static void main(String[] args){

        SmartPhone sp = new SmartPhone();
        System.out.println("Smart Phone Details");
        sp.installApp("WhatsApp");
        sp.call("9876543210");

    }
}