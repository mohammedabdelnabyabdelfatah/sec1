
package sec1software;


public class TV 
{
    static int channel;
    static int volumeLevel;
    static boolean on;
    static int allChannel;
    static int maxVolume;
    public TV()
    {
        channel= 1;
        volumeLevel =1;
        on = false;
        allChannel=120;
        maxVolume=7;
    }
    static public void turnOn()
    {
        on=true;
    }
    static public void turnOff()
    {
        on=false;
    }
    static public void setChannel(int newChannels)
    {
        if(on)
        {
        allChannel+=newChannels;
            System.out.println("we succses to add "+ newChannels + "channels and the new channels number for this TV is "+ allChannel + "Channels" );
        }
        else
            System.out.println("please turn on the TV");
    }
    static public void setVolume(int newVolumes)
    {
        if(on)
        {
        maxVolume+=newVolumes;
         System.out.println("we succses to add "+ newVolumes + "volume and the new volume level for this TV is "+ maxVolume  );
        }
        else
            System.out.println("please turn on the TV");
            
    }
    static public void channelUp()
    {
        if(on)
        {
        if(channel>allChannel)
        {
            channel=1;
            System.out.println("Channel number is 1");
        }
        else
        {
            channel++;
            System.out.println("Channel number is "+ channel);
        }
        }
        else
            System.out.println("please turn on the TV");
    }
    static public void channelDown()
    {
        if(on)
        {
        if (channel == 1)
        {
            channel=allChannel;
            System.out.println("Channel number is "+ allChannel);
        }
        else
            channel--;
        System.out.println("Channel number is "+ channel);
        }
        else
            System.out.println("please turn on the TV");
           
    }
    static public void volumeUp()
    {
        if(on)
        {
        if (volumeLevel==maxVolume)
        {
            System.out.println("Max Volume");
        }
        else
            volumeLevel++;
            System.out.println("volume level is "+ volumeLevel);
        }
        else
            System.out.println("please turn on the TV");
    }
    static public void volumeDown()
    {
        if(on)
        {
        if(volumeLevel==0)
            System.out.println("TV On Mute Mood");
        else volumeLevel--;
        System.out.println("volume level is "+ volumeLevel);
        }
        else
            System.out.println("please turn on the TV");
    }
    
    
    
}
