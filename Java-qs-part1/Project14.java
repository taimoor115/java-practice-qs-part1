class Project14{
    public static void main(String args[]){
        int sos=340;
        //sos is the speed of sound
        int thunder_second=5;
        int Distance_km=sos*thunder_second;
        //Note the time in seconds between the lightning flash and the thunderclap.
        //Divide the number of seconds by 3.
        //That's it! What you've found is the lightning distance in km
        float Distance_miles=thunder_second/5;
        // Measure the time in seconds between the lightning flash and the thunderclap.
        //Divide the number of seconds by 5.
        //Well done, you've just measured the lightning distance in miles
        System.out.println("Distnce in Kilometer:"+Distance_km+"km" );
        System.out.println("Distance in Miles:"+Distance_miles+"miles");


    }
}