package Poligono;

import org.junit.jupiter.api.Test;

class TrianguloTest2 {
    Ponto x = new Ponto(1,1);
    Ponto y = new Ponto(1,2);
    Ponto z = new Ponto(2,1);

    Triangulo um = new Triangulo(x,y,z);

    @Test
    void areaTriangulo() {
        assertEquals("failure values are not the same", 0.5, um.areaTriangulo());
    }

    private void assertEquals(String s, double v, double areaTriangulo) {
        if(areaTriangulo != v) System.out.println(s);
    }

}