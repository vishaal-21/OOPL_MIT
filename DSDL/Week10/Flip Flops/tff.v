module tff(t,clk,reset,q);
input t,clk,reset;
output reg q;

always @(negedge clk or negedge reset)
begin
    if(reset==0)
        q<=0;
    else
        q<=~q;
end
endmodule