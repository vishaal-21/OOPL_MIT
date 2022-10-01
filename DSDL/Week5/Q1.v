module Q1(a,b,lesser,greater,equal);
input wire[4:0] a,b;
wire [5:0] e,g;
output reg lesser,greater,equal;

integer i;
always @(a | b)
begin
	for(i=0;i<5;i++)
	begin	
		e[i] = (a[i] ~^ b[i]);
	end
	equal = e[0] & e[1] & e[2] & e[3] & e[4];
end

g[0] = (a[4] ~^ b[4]) & (a[3] ~^ b[3]) & (a[2] ~^ b[2]) & (a[1] ~^ b[1]) & (a[0] & ~b[0]);
g[1] = (a[4] ~^ b[4]) & (a[3] ~^ b[3]) & (a[2] ~^ b[2]) & (a[1] & ~b[1]);
g[2] = (a[4] ~^ b[4]) & (a[3] ~^ b[3]) & (a[2] & ~b[2]);
g[3] = (a[4] ~^ b[4]) & (a[3] & ~b[3]);
g[4] = (a[4] & ~b[4]);

greater = g[0] | g[1] | g[2] | g[3] | g[4];
lesser = ~(equal | greater);
endmodule