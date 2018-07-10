#Sample Matrix Multiplication Problem

Source code is located under `src` directory.

You can place your libraries and jar files in `lib` directory.

Edit manifest.json file as per your SIPS setup.

#manifest.json

        {
            "PROJECT": "MatMul",
            "ARGS": [],
            "LIB": ["SIPS-lib-0.2-SNAPSHOT-jar-with-dependencies.jar"],
            "OUTPUTFREQUENCY": 100,
            "JVMARGS": [],
            "SCHEDULER": {
                "MaxNodes": "4",
                "Name": "in.co.s13.sips.schedulers.Chunk"
            },
            "MASTER": {
                "HOST": "127.0.0.1",
                "API-PORT": "13139",
                "JOB-PORT": "13136",
                "API-KEY": "ff21930e-2f22-4d57-8ca8-0e1b0d4b4e31",
            },
            "MAIN": "MatMul",
            "ATTCH": []
        }


manifest file is self explanatory.


        {
            "PROJECT": "Name of Project",
            "ARGS": ["Arguments to your java program"],
            "LIB": ["name of the jar files"],
            "OUTPUTFREQUENCY": Number of lines after each node will send the output,
            "JVMARGS": ["JVM arguments"],
            "SCHEDULER": {
                "MaxNodes": "Max Number of Nodes needed to execute this job",
                "Name": "package.name.Classname of the Scheduler"
            },
            "MASTER": {
                "HOST": "IP Address/Hostname of the master node",
                "API-PORT": "13139",
                "JOB-PORT": "13136",
                "API-KEY": "API key needed to communicate with master node",
            },
            "MAIN": "package.name.Classname of mainfile",
            "ATTCH": ["Extra File which can be attached to the Job"] //pending implementation
        }


#List of inbuilt schedulers

        in.co.s13.sips.schedulers.Chunk
        in.co.s13.sips.schedulers.Factoring
        in.co.s13.sips.schedulers.GSS
        in.co.s13.sips.schedulers.TSS
        in.co.s13.sips.schedulers.QSS
        in.co.s13.sips.schedulers.GA
        in.co.s13.sips.schedulers.GATDS


