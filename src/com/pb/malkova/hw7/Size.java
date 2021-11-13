package com.pb.malkova.hw7;

public enum Size {
     XXS("Child size","32"),
     XS("Adult size", "34"),
     S("Adult size", "36"),
     M("Adult size", "40"),
     L("Adult size", "42");
     private final String description;
     private final String euroSize;

     Size(String description,String euroSize) {
          this.description = description;
          this.euroSize = euroSize;
     }

     public String getDescription(){
     return description;
    }
     public String getEuroSize(){
          return euroSize;
     }

     @Override
     public String toString() {
          return euroSize + "(" + description + ")";
     }
}
