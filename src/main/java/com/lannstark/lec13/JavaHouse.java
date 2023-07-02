package com.lannstark.lec13;

public class JavaHouse {

  private String address;
  private JavaLivingRoom livingRoom;

  public JavaHouse(String address) {
    this.address = address;
    this.livingRoom = new JavaLivingRoom(10);
  }

  public JavaLivingRoom getLivingRoom() {
    return livingRoom;
  }

  public static class JavaLivingRoom {
    private double area;

    public JavaLivingRoom(double area) {
      this.area = area;
    }

//    public String getAddress() {
//      return JavaHouse.this.address;
//    }
  }

}
