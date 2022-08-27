module Q2a(a, b, c, d, f, g);
   input a, b, c, d;
   output f, g;
   nand (h, a, b);
   xor (f, d, h, c);
   nor (g, b, c, d);
endmodule 