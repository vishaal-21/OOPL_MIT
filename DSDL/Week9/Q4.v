module Q4(s,En,w,f);
input [2:0] s;
input En;
input [7:0] w;
wire [7:0] y,t;
output f;

integer k;
decoder38 stage1(s,En,y);

assign t[0] = w[0] & y[0];
assign t[1] = w[1] & y[1];
assign t[2] = w[2] & y[2];
assign t[3] = w[3] & y[3];
assign t[4] = w[4] & y[4];
assign t[5] = w[5] & y[5];
assign t[6] = w[6] & y[6];
assign t[7] = w[7] & y[7];

assign f = t[0] | t[1] | t[2] | t[3] | t[4] | t[5] | t[6] | t[7];
endmodule

module decoder38(w,En,y);
input [2:0] w;
input En;
output reg [7:0] y;
integer k;

always @(w or En)
begin
	for(k=0;k<=7;k=k+1)
	begin
		if(En==0)
			y = 8'b00000000;
		else
		begin
			if(w==k)
				y[k]=1;
			else
				y[k]=0;
		end
	end
end
endmodule