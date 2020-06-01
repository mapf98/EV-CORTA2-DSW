public class CannonCamera extends Camera{
  
  @Override
  public void takePhoto(Photo photo){
    System.out.println("Photo taken by Cannon: "); photo.description();
  };
};