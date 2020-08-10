# demo-wsdl-rest-converter
demo-wsdl-rest-converter


# wsimport
wsimport -d '.\src\main\java' -p 'com.example.demowsdlrest.wscalculator.stubs' -target 2.1 -verbose -keep -Xnocompile 'http://www.dneonline.com/calculator.asmx?wsdl'