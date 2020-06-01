class Main {
  public static void main(String[] args) {
    System.out.println("Turning on cameras");
    
    Camera sony = new SonyCamera();
    Camera cannon = new CannonCamera();

    Photo photo1 = new ConcretePhoto();
    photo1 = new LightDecorator(photo1, 0.5);
    photo1 = new SaturationDecorator(photo1, 1);
    photo1 = new ContrastDecorator(photo1, 3);
    
    Photo photo2 = new ConcretePhoto();
    photo2 = new LightDecorator(photo2, 0.7);
    photo2 = new SaturationDecorator(photo2, 0.6);
    photo2 = new ContrastDecorator(photo2, 1);

    System.out.println("\nTaking photos with all configurations\n");
    sony.takePhoto(photo1);
    cannon.takePhoto(photo2);

    System.out.println("\nTaking photos without configurations\n");

    Photo photo3 = new ConcretePhoto();
    sony.takePhoto(photo3);
    cannon.takePhoto(photo3);
  };
};