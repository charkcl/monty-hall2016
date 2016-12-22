# Monty-Hall

A Hoplon implementation of the [Monty-Hall show door game experiment][6].

## Dependencies

- java 1.7+
- [boot][1]

## Usage
### Development
1. Start the `dev` task. In a terminal run:
    ```bash
    $ boot dev
    ```
    This will give you a  Hoplon development setup with:
    - auto compilation on file changes
    - audible warning for compilation success or failures
    - auto reload the html page on changes
    - Clojurescript REPL

2. Go to [http://localhost:8000][2] in your browser. You should see "The Monty Hall" game.

3. If you edit and save a file, the task will recompile the code and reload the
   browser to show the updated version.

### Production
1. Run the `prod` task. In a terminal run:
    ```bash
    $ boot prod
    ```
2. The compiled files will be on the `target/` directory. This will use
   advanced compilation and prerender the html.

### Deployment

Application deployed to [Heroku][3].

1. Get a Heroku account and install the [Heroku toolbelt][4]
1. Create an application in the Heroku dashboard
1. Build a WAR file with `boot make-war`
1. Follow [these instructions][5] to deploy the WAR to Heroku using the `heroku-cli-deploy` tool.

## License

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.

[1]: http://boot-clj.com
[2]: http://localhost:8000
[3]: https://www.heroku.com/
[4]: https://toolbelt.heroku.com/
[5]: https://github.com/heroku/heroku-cli-deploy
[6]: https://monty-hall2016.herokuapp.com/
