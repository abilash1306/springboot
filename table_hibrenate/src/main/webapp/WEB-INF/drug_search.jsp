<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css/casc.css" rel="stylesheet" type="text/css" />

</head>
<body>
<!-- start header -->
<div style = "background-color:#BE482C;height:10%">
<h2 style = "color:white;text-align:center;font-size:40px"> Cancer Drug Database</h2>
</div>
<div id="header">
	<div id="menu">
	</div>

</div>
<div id="page">

 <div id="sidebar">
	<br>		
			<ul>
	<li><a href="/"><h2 class="Submit Data">Home</h2></a></li>
<li><h2 class="Contact us">Browse</h2></a>
                       <a href="/gene_search">Search Genes</a>&nbsp;&nbsp;
			<a href="/drug_search">Search Drugs</a>
                                    
                                </li>

        <li><a href="/contact"><h2 class=" Team">Contact</h2></a></li>
					
				
		<li>
			

				<h2>Other Database Links</h2>
				<ul>
					<li><a href="http://www.megabionet.org/bio/hlung/" target=_blank>HLungDB</a></li>
					<li><a href="http://www.bioinformatics.org/pcgdb/" target=_blank>PCGDB</a></li>
					<li><a href="http://www.tumor-gene.org/tgdf.html" target=_blank>Tumour genes</a></li><li><a href="http://www.urogene.org/pgdb/" target=_blank>PGDB</a></li>
					<li><a href="http://www.miR2Disease.org/" target=_blank>miR2Disease</a></li>
					

					
					
				</ul>
			</li>
		</ul>
	</div>

	<!-- end sidebar -->
	<!-- start content -->
	<div id="content">
		<div class="post">
			<h1 class="title">Query options</h1>
		<div style = "text-align:center;position:left">
			<h1> Search Drug</h1><br>
			<form action = "/drugDetails" method="get">
			  <lable>Drug Search</lable>
			  <input type = "text" name = "drugName" /><br><br><br>
			  <label>Select Category:</label>
			  <select name = "category">
			     <option value="level1" selected>Small molecular drug</option><option value="level2">antibody</option>
			  </select><br><br><br>
			  <input type = "submit" value = "Get Details" />
			</form>
		</div>
			
			<div class="meta">
				<p class="byline">&nbsp</p>
			</div>
		</div>
	</div>
<div style="clear: both;">&nbsp;</div>

</div>
<!-- end header -->
<!-- start page -->



<div id="footer">
	<div id="footer-wrap">
	<p id="legal">Copyright  &copy;  2011. CCDB&nbsp;&nbsp;&nbsp; Contact: <a href="rangavinitha99@gmail.com">Vinitha Ranga</a>.</p>

	</div>

</div>
<!-- end footer -->
</body>


</html>