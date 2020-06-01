public class SonyCamera extends Camera{

  @Override
  public void takePhoto(Photo photo){
    System.out.println("Photo taken by Sony: "); photo.description();
  };
};