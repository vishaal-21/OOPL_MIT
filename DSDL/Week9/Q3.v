module Q3(a,b,c,En,f);
input a,b,c,En;
wire [7:0] y1;
output f;

wire [3:0] w={a,b,c};

decoder2to4 stage1(w[1:0],(~w[2] & En),y1[3:0]);
decoder2to4 stage2(w[1:0],(w[2] & En),y1[7:4]);
assign f = y1[3] | y1[5] | y1[6] | y1[7];
endmodule

module decoder2to4(w,En,y);
input [1:0] w;
input En;
output reg [3:0] y;
always @(w or En)
begin
	y=4'b0000;
    if (En == 1)
    begin
            case(w)
            0:  y=4'b0001;
            1:  y=4'b0010;
            2:  y=4'b0100;
            3:  y=4'b1000;
            endcase
    end
end
endmodule