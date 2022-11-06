module decoder4to16(w,En,y);
input [3:0] w;
input En;
output reg [15:0] y;
integer k;

always @(w or En)
begin
    if(En==1)
    for(k = 0; k <= 15; k = k + 1)
    begin
        if (w == k)
            y[k] = 1;
        else
        	y[k] = 0;
    end
end
endmodule

module Q1(a,b,c,d,En,f);
input a,b,c,d,En;
wire [15:0] y;
output f;

wire [3:0] w={a,b,c,d};

decoder4to16 stage1(w,En,y);
assign f = y[1] | y[3] | y[6] | y[7] | y[9] | y[14] | y[15];
endmodule