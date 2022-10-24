/// the db package
package mojo.db {
    version: '0.1.0'
    authors: [{
        author: 'frankee'
        email:  'frankee.zhou@gmail.com'
        organization: 'mojo-lang.org'
    }]
    
    dependencies: {
        'mojo.core': {repository: 'github.com/mojo-lang/core', version: '^0.1'}
        'mojo.document': {repository: 'github.com/mojo-lang/document', version: '^0.1'}
        'mojo.lang': {repository: 'github.com/mojo-lang/lang', version: '^0.1'}
    }
    repository: 'github.com/mojo-lang/db'
}
