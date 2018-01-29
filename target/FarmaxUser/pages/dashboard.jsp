<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 id="pageHeader" class="page-header"></h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-upload fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge"><span id="currentMonthSaving"></span></div>
							<div><span id="currentMonthSavingHdr"></span></div>
						</div>
					</div>
				</div>
				<!-- 
				<a href="#">
					<div class="panel-footer">
						<span class="pull-left">View Details</span>
						<span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
						<div class="clearfix"></div>
					</div>
				</a>
				 -->
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-green">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-tasks fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge"><span id="currentMonthEarning"></span></div>
							<div><span id="currentMonthEarningHdr"></span></div>
						</div>
					</div>
				</div>
				<!-- 
				<a href="#">
					<div class="panel-footer">
						<span class="pull-left">View Details</span>
						<span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
						<div class="clearfix"></div>
					</div>
				</a>
				 -->
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-yellow">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-minus-circle fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge"><span id="totalOwed"></span></div>
							<div><span id="totalOwedHdr"></span></div>
						</div>
					</div>
				</div>
				<!-- 
				<a href="#">
					<div class="panel-footer">
						<span class="pull-left">View Details</span>
						<span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
						<div class="clearfix"></div>
					</div>
				</a>
				-->
			</div>
		</div>
		<div class="col-lg-3 col-md-6">
			<div class="panel panel-red">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-money fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<div class="huge"><span id="currentMonthExpenses"></span></div>
							<div><span id="currentMonthExpensesHdr"></span></div>
						</div>
					</div>
				</div>
				<!-- 
				<a href="#">
					<div class="panel-footer">
						<span class="pull-left">View Details</span>
						<span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
						<div class="clearfix"></div>
					</div>
				</a>
				 -->
			</div>
		</div>
	</div>
	
	<!--BEGIN : Deal per Currency graph 
	<div id="currDealGraph" class="row">
		<div class="col-lg-12 col-md-12 col-sm-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<i class="fa fa-bar-chart-o fa-fw"></i> Deals per currency
				</div>
				<div class="panel-body">
					<div id="dealsPerCurrencyGraph" style="height: 300px; width: 100%;"></div>
				</div>
			</div>
			<div id="" class="panel panel-default" style="visibility:hidden"></div>
		</div>
	</div>
	-->
	<!--END   : Deal per Currency graph -->
	
	<!-- BEGIN : File Search Model-->
	<div class="modal fade" id="fileSearchDialog" role="dialog" aria-labelledby="fileSearchDialogLabel" tabindex="-1">
		<div class="modal-dialog">
		
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">File Search</h4> 
				</div>
				<div id="fileSearchDisplay" class="modal-body">
					<div id="searchResultTable" class="table-striped">
					<table class="table table-striped">
					    <thead id="searchTableHead">
					      <tr>
					        <th>FileName</th>
					        <th>No of Records uploaded</th>
					      </tr>
					    </thead>
					    <tbody id="searchTableBody"></tbody>
					  </table>
					</div>			
				</div>
				<div class="modal-footer">
				</div>
			</div>
		</div>
	</div>	

	<!-- END   : File Search Model-->
	
</div>
<!-- /#page-wrapper -->



<script type ="text/javascript">

$(document).ready(function() {
	console.log("\tdashboard.jsp");
	
	$.ajax({ 
		url : "resources/javascript/system/dashboard.js",
		dataType : "script",
		cache : true		
	}).done(function(){ 
		console.log("inside done....");
		me.dashboard.onload();
	});
	
});


</script>
