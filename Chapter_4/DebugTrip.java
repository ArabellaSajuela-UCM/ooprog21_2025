// A Trip has three constructors
// When one argument is passed,
// it is the trip destination
// When two arguments are passed,
// they are the destination and departure cities
// When three arguments are passed,
// the last one is the mode of transportation for the trip

import java.util.Scanner;
public class DebugTrip
{
private String destination;
private String departure;
private String mode;
private static final String DEFAULT_CITY = "Atlanta";
private static final String DEFAULT_MODE = "car";

public static void main(String[] args) {

Scanner s = new Scanner(System.in);
String CityDestination;
String CityDeparture;
String mode;
DebugTrip trip2;
DebugTrip trip4;
DebugTrip trip6;

System.out.println("Enter city destination: ");
CityDestination = s.nextLine();
System.out.println("Enter city departure: ");
CityDeparture = s.nextLine();
System.out.println("Enter mode of transportation: ");
mode = s.nextLine();

trip2 = new DebugTrip(CityDestination);
trip4 = new DebugTrip(CityDeparture);
trip6 = new DebugTrip(CityDestination, CityDeparture, mode);
display(trip2);
display(trip4);
display(trip6);
}

public static void display(DebugTrip trip) {
System.out.println("Going to " + trip.getDestination());
System.out.println("Leaving from " + trip.getDepartureCity());
System.out.println("Going by " + trip.getMode());
}
public DebugTrip(String destination)
{
this(destination, DEFAULT_CITY, DEFAULT_MODE);
}
public DebugTrip(String destination, String departure)
{
this.destination = destination;
this.departure = departure;
this.mode = mode;
}
public DebugTrip(String destination, String departure, String mode)
{
this.destination = destination;
this.departure = departure;
this.mode = mode;
}
public String getDestination()
{
return destination;
}
public String getDepartureCity()
{
return departure;
}
public String getMode()
{
return mode;
}
}

//cannot upload to github because I am not the author ://