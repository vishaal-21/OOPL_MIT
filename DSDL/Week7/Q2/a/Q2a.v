module mux21 (w0, w1, s, f);
input w0, w1, s;
output reg f;
always @(w0 or w1 or s)
begin
	if(s==0)
		assign f=w0;
	else
		assign f=w1;
end
endmodule

module Q2a(x,y,z,f);
input x,y,z;
output f;

mux21 stage1((y&z),(y|z),x,f);
endmodule