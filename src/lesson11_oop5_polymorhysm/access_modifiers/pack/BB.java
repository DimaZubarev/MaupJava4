package lesson11_oop5_polymorhysm.access_modifiers.pack;

public class BB extends A{
    int newField;
    void m (){
        this.value = 1;
        // протектед доступний з OuterPack в нащадках
    }
}
