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
		</ul></li></ul>
	</div>

	<!-- end sidebar -->
	<!-- start content -->
	<div id="content">
		<div class="post">
			<h1 class="title">Query options</h1>
<table><table>
<tr>
                                <th colspan="4" align="left"><i>Search Genes</i></th>
                              </tr>	
<form action = "/geneDetails" method = "post"><table width="95%" border="0" align="center" cellpadding="6" cellspacing="0">
                              <tr>
                                <th colspan="4" align="left">Keyword Search</th>
                              </tr>

                              
                               <tr>
                                 <td width="20%">Keyword:</td>
                                 <td width="20%"><form action = "/geneDetails" method = "post">
                                  <input type = "textbox" name="searchtext" style="color:royalblue;" size="15">
&nbsp;&nbsp;<input type="submit" value="Get it"></form></td></tr>
                               </table><td height="10"></td>
                          </tr>
	<tr>
                            <td height="10"></td>
                          </tr>
                          <tr>
                            <td height="1" bgcolor="#CCCCCC"></td>
                            </tr>

                            
                          

                          <tr>
                            <td height="1" bgcolor="#CCCCCC"></td>
                            </tr><tr>
                            <td height="10"></td>
                          </tr><tr>
                            <td height="10"></td>
                          </tr>
				


			
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
	<p id="legal">Copyright  &copy;  2011. RCDB&nbsp;&nbsp;&nbsp; Contact: <a href="mailto:jayashree.ramana@juit.ac.in">Jayashree Ramana</a>.</p>

	</div>

</div>
<!-- end footer -->
</body>


</html>