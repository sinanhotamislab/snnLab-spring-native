db.createUser(
    {
        user: "snnLab",
        pwd: "snnLab",
        roles: [
            {
                role: "readWrite",
                db: "snnLab"
            }
        ]
    }
);

db.snnLabCollection.insertOne({
        name:"Sinan",
        surname:"Hotamış"});
