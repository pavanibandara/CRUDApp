angular.module("crudapp").controller("GeneralController",GeneralController);

GeneralController.inject = ['$scope','Employee'];

function GeneralController($scope,Employee){
	
	$scope.employees = Employee.query();
	$scope.employee = {};
	$scope.buttonText = "Submit";
	
	//create employee
	$scope.saveEmployee=function(){
		if($scope.employee.id !== undifend){
			Employee.update($scope,employee,function(){
				$scope.employees = Employee.query();
				$scope.employee = {};
				$scope.buttonText = "Submit";
			});
		}else{
			Employee.update($scope,employee,function(){
				$scope.employees = Employee.query();
				$scope.employee = {};
			});
		}
	}
	
	//update employee
	$scope.updateEmployee=function(employee){
		$scope.buttonText = "Update";
		$scope.employee = employee;
	}
	
	//delete employee
	$scope.deleteEmployee=function(employee){
		employee.$delete({id:employee.id},function(){
			$scope.employees = Employee.query();
		});
	}
}
