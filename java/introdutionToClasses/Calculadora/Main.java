public class Main{
  int x;
  int y;
  float r;
    public Main (int a, int b, float c){
      x = a;
      y = b;
      r = c;
    }
  public float sumar(int a, int b){
    x = a;
    y = b;
    return r = x + y;
  }
  
  public float multiplicar(int a, int b){
    x = a;
    y = b;
    r = x * y;
    return r;
  }
  public float dividir(int a, int b){
    x = a;
    y = b;
    r = x / y;
    return r;
  }
  public float potencia (int a, int b){
    x = a;
    y = b;
    r = x ^ y;
    return r;
  public static void main (String[] args){
      Main obj1 = new Main(0,0,0);
      obj1.sumar(21,4);
      obj1.imprimirResultado();
    
      Main obj2 = new Main(0,0,0);
      obj2.restar(21,4);
      obj2.imprimirResultado();
    
      Main obj3 = new Main(0,0,0);
      obj3.multiplicar(2,4);
      obj3.imprimirResultado();
      
      Main obj4 = new Main(0,0,0);
      obj4.dividir(2,4);
      obj4.imprimirResultado();

     Main obj5 = new Main(0,0,0);
      obj5.potencia(2,4);
      obj5.imprimirResultado();

    }
    public void imprimirResultado(){
      System.out.println("El resultado es: "+r);
  }
  public float restar(int a, int b){
    x = a;
    y = b;
    r = x - y;
    return r;
  }
}
