module Counter2Bit(clk,reset,q);
input clk,reset;
output [1:0]q;

dff ff1(~q[0],clk,reset,q[0]);
dff ff2(q[0]^q[1],clk,reset,q[1]);
endmodule

module dff(d,clk,reset,q);
input d,clk,reset;
output reg q;

always @(posedge clk or posedge reset)
begin
    if(reset)
        q<=0;
    else
        q<=d;
end
endmodule