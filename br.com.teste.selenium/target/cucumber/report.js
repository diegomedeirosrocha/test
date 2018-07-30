$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Compra.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Efatuar compra",
  "description": "",
  "id": "efatuar-compra",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#####################################################"
    },
    {
      "line": 5,
      "value": "#\t\t    VALIDOS  \t    #"
    },
    {
      "line": 6,
      "value": "#####################################################"
    }
  ],
  "line": 8,
  "name": "\u003cCenario\u003e Efetuar Compra",
  "description": "",
  "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CT01"
    },
    {
      "line": 7,
      "name": "@EfetuarCompraValidos"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que usuario tenha selecionado os produtos para compra \"\u003cqtdeItens\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "exibir tela para confirmar produtosSelecionados",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "preencher dados de envio cobranca e clicar em PlaceToOrder \"\u003cnome\u003e\", \"\u003cendereco\u003e\", \"\u003ccidade\u003e\", \"\u003cuf\u003e\", \"\u003ccep\u003e\", \"\u003ctelefone\u003e\", \"\u003cemail\u003e\", \"\u003cbandeiraCartao\u003e\", \"\u003cnroCartao\u003e\", \"\u003ccodCvc\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "deve exibir tela tela de resumo da compra",
  "keyword": "Entao "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra;",
  "rows": [
    {
      "cells": [
        "Cenario",
        "qtdeItens",
        "nome",
        "endereco",
        "cidade",
        "uf",
        "cep",
        "telefone",
        "email",
        "bandeiraCartao",
        "nroCartao",
        "codCvc"
      ],
      "line": 15,
      "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra;;1"
    },
    {
      "cells": [
        "CT01.01 com cartao MasterCard - sucesso",
        "3",
        "teste",
        "rua teste",
        "Sao Paulo",
        "SP",
        "32808",
        "4072704300",
        "teste@gmail.com",
        "MasterCard",
        "5484604609172765",
        "483"
      ],
      "line": 16,
      "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 4145389941,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d68.0.3440.75)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027DESKTOP-GD4USCI\u0027, ip: \u0027192.168.1.71\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Diego\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.75, webStorageEnabled: true}\nSession ID: c4fa43f504525c8702a4ea22157579f4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat br.com.teste.selenium.compra.steps.CompraSteps.setUp(CompraSteps.java:151)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:201)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 16,
  "name": "CT01.01 com cartao MasterCard - sucesso Efetuar Compra",
  "description": "",
  "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CT01"
    },
    {
      "line": 7,
      "name": "@EfetuarCompraValidos"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que usuario tenha selecionado os produtos para compra \"3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "exibir tela para confirmar produtosSelecionados",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "preencher dados de envio cobranca e clicar em PlaceToOrder \"teste\", \"rua teste\", \"Sao Paulo\", \"SP\", \"32808\", \"4072704300\", \"teste@gmail.com\", \"MasterCard\", \"5484604609172765\", \"483\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "deve exibir tela tela de resumo da compra",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 55
    }
  ],
  "location": "CompraSteps.queUsuarioTenhaSelecionadoOsProdutosParaCompra(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompraSteps.exibirTelaParaConfirmarProdutosSelecionados()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "teste",
      "offset": 60
    },
    {
      "val": "rua teste",
      "offset": 69
    },
    {
      "val": "Sao Paulo",
      "offset": 82
    },
    {
      "val": "SP",
      "offset": 95
    },
    {
      "val": "32808",
      "offset": 101
    },
    {
      "val": "4072704300",
      "offset": 110
    },
    {
      "val": "teste@gmail.com",
      "offset": 124
    },
    {
      "val": "MasterCard",
      "offset": 143
    },
    {
      "val": "5484604609172765",
      "offset": 157
    },
    {
      "val": "483",
      "offset": 177
    }
  ],
  "location": "CompraSteps.preencherDadosDeEnvioCobrancaEClicarEmPlaceToOrder(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompraSteps.deveExibirTelaTelaDeResumoDaCompra()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 584183890,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 17,
      "value": "# | CT01.02 com cartao Visa - sucesso             |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | Visa           | 4012001037141112 |    123 |"
    },
    {
      "line": 18,
      "value": "# | CT01.03 com cartao American express - sucesso |         3 | teste | rua teste | Sao Paulo | SP | 32808 | 4072704300 | teste@gmail.com | Amex           | 3710134855548766 |    900 |"
    },
    {
      "line": 20,
      "value": "#####################################################"
    },
    {
      "line": 21,
      "value": "#\t\t    INVALIDOS  \t    #"
    },
    {
      "line": 22,
      "value": "#####################################################"
    }
  ],
  "line": 24,
  "name": "\u003cCenario\u003e Efetuar Compra",
  "description": "",
  "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 23,
      "name": "@CT02"
    },
    {
      "line": 23,
      "name": "@EfetuarCompraIvalidos"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "que usuario tenha selecionado os produtos para compra \"\u003cqtdeItens\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 26,
  "name": "exibir tela para confirmar produtosSelecionados",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "preencher dados de envio cobranca e clicar em PlaceToOrder \"\u003cnome\u003e\", \"\u003cendereco\u003e\", \"\u003ccidade\u003e\", \"\u003cuf\u003e\", \"\u003ccep\u003e\", \"\u003ctelefone\u003e\", \"\u003cemail\u003e\", \"\u003cbandeiraCartao\u003e\", \"\u003cnroCartao\u003e\", \"\u003ccodCvc\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "deve exibir tela tela de resumo da compra",
  "keyword": "Entao "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra;",
  "rows": [
    {
      "cells": [
        "Cenario",
        "qtdeItens",
        "nome",
        "endereco",
        "cidade",
        "uf",
        "cep",
        "telefone",
        "email",
        "bandeiraCartao",
        "nroCartao",
        "codCvc"
      ],
      "line": 31,
      "id": "efatuar-compra;\u003ccenario\u003e-efetuar-compra;;1"
    }
  ],
  "keyword": "Exemplos"
});
});