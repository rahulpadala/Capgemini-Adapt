import React, {Component} from 'react';

function Employee() {
    const classes = useStyles(); 
   return (
       <div>
           {/**************using  REACT Tables******************/} 
           <TableHead component={Paper}>
               <Table className={classes.table} aria-label="simple table">
                   <TableHead>
                       <TableRow>
                        
                           <TableCell className={classes.bold}>Name</TableCell>
                           <TableCell className={classes.bold}>Job</TableCell>
                       </TableRow>
                   </TableHead>
                   <TableBody>
                       <TableRow>
                           <TableCell>Charlie</TableCell>
                           <TableCell>Janitor</TableCell>
                       </TableRow>
                       <TableRow>
                           <TableCell>Mac</TableCell>
                           <TableCell>Bouncer</TableCell>
                       </TableRow>
                       <TableRow>
                           <TableCell>Dee</TableCell>
                           <TableCell>Aspiring Actress</TableCell>
                       </TableRow>
                       <TableRow>
                           <TableCell>Dennis</TableCell>
                           <TableCell>Bartender</TableCell>
                       </TableRow>
                   </TableBody>
               </Table> 
               </TableHead>
              
       </div>
       )
}

export default Employee