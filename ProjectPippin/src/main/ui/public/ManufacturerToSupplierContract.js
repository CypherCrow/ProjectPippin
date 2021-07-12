const hash = ""

const provider = new Neon.api.neoscan.instance("TestNet"); 

Neon.settings.httpsOnly = true; 

function InvokeOperation() {
    clearHtml(); 

    provider.getRPCEndpoint().then(nodeUrl => {
        client.getContractState(hash).then(response => {
            outputHtml("Result: ");  
        })
    })
}