package testcomputer;

public class Computer{
    private USB[] usbArr=new USB[4];

    public void add(USB usb1){
        for(int i=0;i<usbArr.length;i++){
            if(usbArr[i]==null){
                usbArr[i]=usb1;
                break;
            }    
        }
    }
    public void powerOn(){
        for(int i=0;i<usbArr.length;i++){
            if(usbArr[i]!=null)
            usbArr[i].turnOn();
        }

        System.out.println("computer power on compelete");
    }
    public void powerOff(){
        for(int i=0;i<usbArr.length;i++){
            if(usbArr[i]!=null)
            usbArr[i].turnOff();
        }

    System.out.println("computer power off compelete");

    }
}
